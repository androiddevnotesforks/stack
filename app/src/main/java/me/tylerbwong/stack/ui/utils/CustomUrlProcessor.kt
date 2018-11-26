package me.tylerbwong.stack.ui.utils

import ru.noties.markwon.UrlProcessor

class CustomUrlProcessor : UrlProcessor {
    override fun process(destination: String): String {
        var url = destination
        if (!destination.contains("http")) {
            url = "https:$destination"
        }
        return url
    }
}