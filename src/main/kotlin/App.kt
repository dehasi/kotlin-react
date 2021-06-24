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
import react.setState
import styled.css
import styled.styledDiv


external interface AppState : RState {
    var currentVideo: Video?
}

@JsExport
class App : RComponent<RProps, AppState>() {
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
                attrs.selectedVideo = state.currentVideo
                attrs.onSelectVideo = { video -> setState { currentVideo = video } }
            }

            h3 {
                +"Videos watched"
            }
            videoList {
                videos = watchedVideos
                selectedVideo = state.currentVideo
                onSelectVideo = { video -> setState { currentVideo = video } }
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