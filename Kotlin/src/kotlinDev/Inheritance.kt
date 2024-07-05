package kotlinDev

fun main() {

    var smartdevice : SmartDevice = SmartTvDevice("LivingTv","Entertainment")
    smartdevice.turnOn()

    smartdevice = SmartLight("RoomLight","Electrical")
    smartdevice.turnOn()
}


/*
As we can see that we write open keyword before class keyword because,
I want to extend this classes in the future...

The open keyword informs the compiler that this class is extendable,
so now other classes can extend it.
*/
open class SmartDevice(val name: String, val category: String){
    var deviceStatus = "online"
        protected set

    open val deviceType = "unknown"

    fun deviceName(){
        println("Device name: $name, category: $category, type: $deviceType.")
    }

    open fun turnOn() {
        // function body
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }
}

class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {
    override val deviceType = "tv"

    /*
        private var tvVolume: Int = 2
            set(value) {
                if (value in 1..100){
                    field = value
                }
            }

        private var channelNum: Int = 102
            set(value) {
                if (value in 1..500){
                    field = value
                }
            }
     */

    private var tvVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)
    private var channelNum by RangeRegulator(initialValue = 45, minValue = 1, maxValue = 500)

        fun increaseSpeakerVolume(){
            tvVolume++
            println("Speaker volume increased to $tvVolume.")
        }

        fun decreaseSpeakerVolume(){
            tvVolume--
            println("Speaker volume decrease to $tvVolume.")
        }

        override fun turnOn(){
            super.turnOn()

            println(
                "$name is turned on. Speaker volume is set to $tvVolume and channel number is " +
                        "set to $channelNum."
            )
        }

        override fun turnOff(){
            super.turnOff()
            println("Turn off device...")
        }

    fun nextChannel(){
        channelNum++
        println("Channel number increased to $channelNum.")
    }
    fun previousChannel(){
        channelNum--
        println("Previous channel $channelNum. ")
    }
    }

class SmartLight(deviceName: String, deviceCategory: String) :
        SmartDevice(name = deviceName, category = deviceCategory) {
    override val deviceType = "light"

    /*
            private var brightnessLevel: Int = 1
                set(value) {
                    if (value in 1..100){
                        field = value
                    }
                }

     */

    private var brightnessLevel by RangeRegulator(initialValue = 50, minValue = 1, maxValue = 100)

            fun brightnessLevel(){
                brightnessLevel++
                println("Brightness increased to $brightnessLevel.")
            }

            fun decreaseBrightnessLevel(){
                brightnessLevel--
                println("Brightness decreased to $brightnessLevel.")
            }

            //override function
            override fun turnOn(){
                super.turnOn()
                brightnessLevel = 2
                println("$name turned on. The brightness level is $brightnessLevel.")
            }

            //override function
            override fun turnOff(){
                super.turnOff()
                brightnessLevel = 0
                println("Smart Light turned off")
            }
        }

//Has-A Relation
class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLight
    ){

    var deviceTurnOnCount = 0
        private set
    fun turnOnTv(){
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }

    fun turnOffTv(){
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume(){
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext(){
        smartTvDevice.nextChannel()
    }

    fun turnOnLight(){
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight(){
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness(){
        smartLightDevice.brightnessLevel()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }


}