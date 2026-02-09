val rockPlanets = arrayOf("Mercury" , "Venus" , "Earth" , " Mars")
val gasPlanets = arrayOf("Jupiter" , "Saturn" , " Uranus" , " Neptune")
val solarSystem = rockPlanets+ gasPlanets
fun main()
{
    val solarSystem = mutableListOf("Mercury" , "Venus" , "Earth" , " Mars","Jupiter" , "Saturn" , " Uranus" , " Neptune" )
    for ( planet in solarSystem){
        println(planet)
    }
    solarSystem.add("Pluto")
    solarSystem.add(4,"Theia")
    solarSystem[3] = "Future Moon"
    println(solarSystem.contains("Pluto"))
    println("Future Moon" in solarSystem)
}
