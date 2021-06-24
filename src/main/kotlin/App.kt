import kotlinx.css.Position
import kotlinx.css.position
import kotlinx.css.px
import kotlinx.css.right
import kotlinx.css.top
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.h1
import react.dom.h3
import react.dom.img
import styled.css
import styled.styledDiv

@JsExport
class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h1 {
            +"Hello, React+KotlinJS"
        }
        div {
            h3 {
                +"Videos to watch"
            }
            child(VideoList::class) {
                attrs.videos = unwatchedVideos
            }

            h3 {
                +"Videos watched"
            }
            videoList {
                videos = watchedVideos
            }
        }
        styledDiv {
            css {
                position = Position.absolute
                top = 10.px
                right = 10.px
            }
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