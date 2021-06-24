import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.p

@JsExport
class VideoList : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        for (video in unwatchedVideos) {
            p {
                +"${video.speaker}: ${video.title}"
            }
        }
    }
}