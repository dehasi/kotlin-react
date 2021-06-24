import kotlinx.browser.document
import react.dom.div
import react.dom.h1
import react.dom.h3
import react.dom.img
import react.dom.p
import react.dom.render

fun main() {

    render(document.getElementById("root")) {
        h1 {
            +"Hello, React+KotlinJS"
        }
        div {
            h3 {
                +"Videos to watch"
            }
            p {
                +"John Doe: Building and breaking things"
            }
            p {
                +"Jane Smith: The development process"
            }
            p {
                +"Matt Miller: The Web 7.0"
            }

            h3 {
                +"Videos watched"
            }
            p {
                +"Tom Jerry: Mouseless development"
            }
        }
        div {
            h3 {
                +"John Doe: Building and breaking things"
            }
            img {
                attrs {
                    src = "https://via.placeholder.com/640x360.png?text=Video+Player+Placeholder"
                }
            }
        }
    }
}