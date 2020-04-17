import react.dom.*
import kotlin.browser.document
import sample.hello

fun main() {
    render(document.getElementById("root")) {
        h1 {
            +"Hello, React+Kotlin/${hello()}!"
        }
    }
}