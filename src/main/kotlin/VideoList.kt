import kotlinx.browser.window
import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement
import react.dom.p
import react.setState

external interface VideoListProps : RProps {
    var videos: List<Video>
}

external interface VideoListState : RState {
    var selectedVideo: Video?
}

@JsExport
class VideoList : RComponent<VideoListProps, VideoListState>() {
    override fun RBuilder.render() {
        for (video in props.videos) {
            p {
                key = video.id.toString()
                attrs {
                    onClickFunction = {
                        setState {
                            selectedVideo = video
                        }
                    }
                }
                if (video == state.selectedVideo) {
                    +"▶ "
                }
                +"${video.speaker}: ${video.title}"
            }
        }
    }
}

fun RBuilder.videoList(handler: VideoListProps.() -> Unit): ReactElement {
    return child(VideoList::class) {
        this.attrs(handler)
    }
}