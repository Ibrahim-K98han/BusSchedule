package com.ibrahim.busschedule

val cityList = listOf("Dhaka","Chittagong","Rajshahi","Borishal","Noakhali","Mymensingh","Khulna","Sylhet","Tangail","Norsingdhi","Shariatpur","Cumilla")
val busTypeEconomy = "Economy"
val busTypeBusiness = "Business"
data class BusSchedule(
    val id:Long,
    val busName:String,
    val from:String,
    val to:String,
    val departureDate:String,
    val departureTime:String,
    val busType:String
)