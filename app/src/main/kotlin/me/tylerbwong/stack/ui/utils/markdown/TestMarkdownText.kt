package me.tylerbwong.stack.ui.utils.markdown

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview
import me.tylerbwong.markdown.compose.MarkdownText

@Preview
@Composable
fun TestMarkdownText() {
    MarkdownText(
        markdown = """
            # This is a test
            ## This is another test
            ### This is **another** test
            #### This is _another_ test
            ##### `code`
            
            This is a **full** on test with some _markdown_!
            What's really cool is the `code blocks` that show up too.
        """.trimIndent()
    )
}
