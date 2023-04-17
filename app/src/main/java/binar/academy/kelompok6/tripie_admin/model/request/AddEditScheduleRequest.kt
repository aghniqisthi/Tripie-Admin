package binar.academy.kelompok6.tripie_admin.model.request


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class AddEditScheduleRequest(
    @SerializedName("origin_code")
    val originCode: String,
    @SerializedName("origin_name")
    val originName: String,
    @SerializedName("origin_city")
    val originCity: String,
    @SerializedName("destination_code")
    val destinationCode: String,
    @SerializedName("destination_name")
    val destinationName: String,
    @SerializedName("destination_city")
    val destinationCity: String,
    @SerializedName("plane_class")
    val planeClass: String,
    @SerializedName("flight_date")
    val flightDate: String,
    @SerializedName("airline_name")
    val airlineName: String,
    @SerializedName("departure_hour")
    val departureHour: String,
    @SerializedName("arrival_hour")
    val arrivalHour: String,
    @SerializedName("price")
    val price: Int
) : Parcelable