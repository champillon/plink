package models.mailgun.components

case class ClientInfo(clientOs: String
                      , deviceType: String
                      , clientName: String
                      , clientType: String
                      , userAgent: String)

/*
 "client-info": {
        "client-os": "Windows",
        "device-type": "desktop",
        "client-name": "Firefox",
        "client-type": "browser",
        "user-agent": "Mozilla/5.0 (Windows NT 5.1; rv:11.0) Gecko Firefox/11.0 (via ggpht.com GoogleImageProxy)"
    }
 */