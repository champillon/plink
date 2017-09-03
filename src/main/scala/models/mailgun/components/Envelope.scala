package models.mailgun.components

case class Envelope(transport: String
                    , sender: String
                    , sendingIp: String
                    , targets: String)

/*
"envelope": {
        "transport": "smtp",
        "sender": "noreply@aaa.com",
        "sending-ip": "184.173.153.38",
        "targets": "patpichar31@gmail.com"
    }
 */