package me.tylerbwong.stack.ui.questions.detail

import android.animation.AnimatorInflater
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import androidx.lifecycle.observe
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_question_detail.*
import me.tylerbwong.stack.R
import me.tylerbwong.stack.ui.BaseActivity
import me.tylerbwong.stack.ui.utils.hideKeyboard
import me.tylerbwong.stack.ui.utils.setThrottledOnClickListener

class QuestionDetailActivity : BaseActivity() {

    private val viewModel by viewModels<QuestionDetailMainViewModel>()
    private lateinit var adapter: QuestionDetailPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_detail)
        setSupportActionBar(toolbar)
        setTitle("")

        if (viewModel.questionId == -1) {
            viewModel.questionId = intent.getIntExtra(QUESTION_ID, -1)
        }

        viewModel.canAnswerQuestion.observe(this) {
            toggleAnswerButtonVisibility(isVisible = it && !viewModel.isInAnswerMode)
        }

        postAnswerButton.setThrottledOnClickListener {
            toggleAnswerMode(isInAnswerMode = true)
        }

        adapter = QuestionDetailPagerAdapter(this, viewModel.questionId)
        viewPager.adapter = adapter
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrollStateChanged(state: Int) {
                // no-op
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                // no-op
            }

            override fun onPageSelected(position: Int) {
                appBar.stateListAnimator = AnimatorInflater.loadStateListAnimator(
                    this@QuestionDetailActivity,
                    if (position == 0) {
                        R.animator.app_bar_elevation
                    } else {
                        R.animator.app_bar_no_elevation
                    }
                )
            }
        })
        toggleAnswerMode(isInAnswerMode = viewModel.isInAnswerMode)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        if (viewModel.isInAnswerMode) {
            if (viewModel.hasContent) {
                MaterialAlertDialogBuilder(this)
                    .setBackground(ContextCompat.getDrawable(this, R.drawable.default_dialog_bg))
                    .setTitle(R.string.discard_answer)
                    .setPositiveButton(R.string.discard) { _, _ ->
                        toggleAnswerMode(isInAnswerMode = false)
                    }
                    .setNegativeButton(R.string.cancel) { dialog, _ -> dialog.cancel() }
                    .create()
                    .show()
            } else {
                toggleAnswerMode(isInAnswerMode = false)
            }
        } else {
            super.onBackPressed()
        }
    }

    internal fun setTitle(title: String) {
        // Save the title from other sources to use on config changes when not in answer mode
        viewModel.title = title
        if (!viewModel.isInAnswerMode) {
            supportActionBar?.title = title
        }
    }

    internal fun extendAnswerButton() = postAnswerButton.extend()

    internal fun shrinkAnswerButton() = postAnswerButton.shrink()

    internal fun toggleAnswerMode(isInAnswerMode: Boolean) {
        viewModel.isInAnswerMode = isInAnswerMode
        viewPager.apply {
            currentItem = if (isInAnswerMode) {
                1
            } else {
                0
            }
            isUserInputEnabled = isInAnswerMode
        }
        toggleAnswerButtonVisibility(isVisible = !isInAnswerMode)
        if (!isInAnswerMode) {
            viewPager.hideKeyboard()
            viewModel.clearFields()
        }
        supportActionBar?.apply {
            if (isInAnswerMode) {
                setHomeAsUpIndicator(R.drawable.ic_close)
                setTitle(R.string.post_answer)
            } else {
                setHomeAsUpIndicator(R.drawable.ic_arrow_back)
                title = viewModel.title
            }
        }
    }

    private fun toggleAnswerButtonVisibility(isVisible: Boolean) = if (isVisible) {
        postAnswerButton.show()
    } else {
        postAnswerButton.hide()
    }

    companion object {
        internal const val QUESTION_ID = "id"

        fun makeIntent(
            context: Context,
            id: Int
        ) = Intent(context, QuestionDetailActivity::class.java)
            .putExtra(QUESTION_ID, id)

        fun startActivity(
            context: Context,
            id: Int
        ) {
            context.startActivity(makeIntent(context, id))
        }
    }
}
