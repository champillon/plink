package models.mailgun.components

/*
"geolocation": {
        "country": "Unknown",
        "region": "Unknown",
        "city": "Unknown"
    }
 */
case class Geolocation(country: String
                       , region: String
                       , city: String)