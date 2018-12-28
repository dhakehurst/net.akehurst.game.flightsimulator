package net.akehurst.game.flightsimulator.application.flight

import kotlin.jvm.JvmStatic

object Standalone {

    @JvmStatic
    fun main(args : Array<String>) {
        val application = FlightApplication(arrayOf(""))
        application.run()
    }
}