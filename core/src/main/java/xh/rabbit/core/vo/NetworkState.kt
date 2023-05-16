package xh.rabbit.core.vo


@Suppress("DataClassPrivateConstructor")
data class NetworkState private constructor(val status: Status, val msg: String? = null) {
    companion object {
        val LOADED = NetworkState(Status.SUCCESS)
        val LOADING = NetworkState(Status.LOADING)
        fun error(msg: String?) = NetworkState(Status.ERROR, msg)
    }
}