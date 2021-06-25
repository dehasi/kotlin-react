@file:JsModule("react-youtube-lite")
@file:JsNonModule

import react.RClass
import react.RProps

@JsName("ReactYouTubeLite")
external val reactPlayer: RClass<dynamic>

external interface ReactYouTubeProps : RProps {
    var url: String
}