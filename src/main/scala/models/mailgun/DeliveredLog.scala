package models.mailgun

import models.mailgun.components._

case class DeliveredLog(tags: List[String]
                        , deliveryStatus: DeliveryStatus
                        , storage: Storage
                        , logLevel: String
                        , id: String
                        , campaigns: List[String]
                        , userVariables: Option[Map[String, String]]
                        , flags: Flags
                        , recipientDomain: String
                        , timestamp: Double
                        , envelope: Envelope
                        , message: Message
                        , recipient: String
                        , event: String)

/*
{
    "tags": [
        "purpose:VERIFY_EMAIL"
    ],
    "delivery-status": {
        "tls": true,
        "mx-host": "gmail-smtp-in.l.google.com",
        "code": 250,
        "description": "",
        "session-seconds": 1.5237369537353516,
        "utf8": true,
        "attempt-no": 1,
        "message": "OK",
        "certificate-verified": true
    },
    "storage": {
        "url": "https://sw.api.mailgun.net/v3/domains/billme.co.th/messages/eyJwIjpmYWxzZSwiayI6ImJlNmJkZWRhLTM0ZmMtNDVmYS05NjYzLTcwYjM1Y2FkZTJiYSIsInMiOiJhM2EwMGUxNmU4IiwiYyI6InRhbmtiIn0=",
        "key": "eyJwIjpmYWxzZSwiayI6ImJlNmJkZWRhLTM0ZmMtNDVmYS05NjYzLTcwYjM1Y2FkZTJiYSIsInMiOiJhM2EwMGUxNmU4IiwiYyI6InRhbmtiIn0="
    },
    "log-level": "info",
    "id": "S8QXAZRZSMumaAiu3MItgg",
    "campaigns": [],
    "user-variables": {},
    "flags": {
        "is-routed": false,
        "is-authenticated": true,
        "is-system-test": false,
        "is-test-mode": false
    },
    "recipient-domain": "gmail.com",
    "timestamp": 1504400393.536119,
    "envelope": {
        "transport": "smtp",
        "sender": "noreply@aaa.com",
        "sending-ip": "184.173.153.38",
        "targets": "patpichar31@gmail.com"
    },
    "message": {
        "headers": {
            "to": "นางสาวภัช ภัค <p31@gmail.com>",
            "message-id": "20170903005951.49262.365EDCC263C33C30@billme.co.th",
            "from": "Double A <noreply@aaa.com>",
            "subject": "Welcome to Double A"
        },
        "attachments": [],
        "size": 12751
    },
    "recipient": "p31@gmail.com",
    "event": "delivered"
}
 */