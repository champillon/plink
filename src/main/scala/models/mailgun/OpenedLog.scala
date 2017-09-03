package models.mailgun

import models.mailgun.components.{ClientInfo, Geolocation, Message}

case class OpenedLog(geolocation: Geolocation
                     , tags: List[String]
                     , ip: String
                     , logLevel: String
                     , id: String
                     , campaigns: List[String]
                     , userVariables: Option[Map[String, String]]
                     , recipientDomain: String
                     , timestamp: Double
                     , clientInfo: ClientInfo
                     , message: Message
                     , recipient: String
                     , event: String)

/*
{
    "geolocation": {
        "country": "Unknown",
        "region": "Unknown",
        "city": "Unknown"
    },
    "tags": [
        "purpose:SEND_BILLING",
        "merchant:6791448980"
    ],
    "ip": "66.249.82.76",
    "log-level": "info",
    "id": "NEdsZyJuRVKLUHPHNRijtw",
    "campaigns": [],
    "user-variables": {},
    "recipient-domain": "gmail.com",
    "timestamp": 1504421124.979057,
    "client-info": {
        "client-os": "Windows",
        "device-type": "desktop",
        "client-name": "Firefox",
        "client-type": "browser",
        "user-agent": "Mozilla/5.0 (Windows NT 5.1; rv:11.0) Gecko Firefox/11.0 (via ggpht.com GoogleImageProxy)"
    },
    "message": {
        "headers": {
            "message-id": "20170702161804.122842.0A69345BBA377758@aaa.com"
        }
    },
    "recipient": "2848@gmail.com",
    "event": "opened"
}
 */