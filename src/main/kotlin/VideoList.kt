import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.p

external interface VideoListProps : RProps {
    var videos: List<Video>
}

@JsExport
class VideoList : RComponent<VideoListProps, RState>() {
    override fun RBuilder.render() {
        for (video in props.videos) {
            p {
                key = video.id.toString()
                +"${video.speaker}: ${video.title}"
            }
        }
    }
}