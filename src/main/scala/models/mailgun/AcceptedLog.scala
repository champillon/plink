package models.mailgun

import models.mailgun.components.{Envelope, Flags, Message, Storage}

case class AcceptedLog(tags: List[String]
                       , envelope: Envelope
                       , storage: Storage
                       , logLevel: String
                       , id: String
                       , campaigns: List[String]
                       , method: String
                       , userVariables: Option[Map[String, String]]
                       , flags: Flags
                       , recipientDomain: String
                       , timestamp: Double
                       , message: Message
                       , recipient: String
                       , event: String)

/*
{
    "tags": [
        "purpose:VERIFY_EMAIL"
    ],
    "envelope": {
        "sender": "noreply@aaa.com",
        "transport": "smtp",
        "targets": "p31@gmail.com"
    },
    "storage": {
        "url": "https://sw.api.mailgun.net/v3/domains/billme.co.th/messages/eyJwIjpmYWxzZSwiayI6ImJlNmJkZWRhLTM0ZmMtNDVmYS05NjYzLTcwYjM1Y2FkZTJiYSIsInMiOiJhM2EwMGUxNmU4IiwiYyI6InRhbmtiIn0=",
        "key": "eyJwIjpmYWxzZSwiayI6ImJlNmJkZWRhLTM0ZmMtNDVmYS05NjYzLTcwYjM1Y2FkZTJiYSIsInMiOiJhM2EwMGUxNmU4IiwiYyI6InRhbmtiIn0="
    },
    "log-level": "info",
    "id": "pja23YqMS0O_hD9vfFHEyQ",
    "campaigns": [],
    "method": "http",
    "user-variables": {},
    "flags": {
        "is-routed": false,
        "is-authenticated": true,
        "is-system-test": false,
        "is-test-mode": false
    },
    "recipient-domain": "gmail.com",
    "timestamp": 1504400391.494608,
    "message": {
        "headers": {
            "to": "นางสาวภัช ภัค <p31@gmail.com>",
            "message-id": "20170903005951.49262.365EDCC263C33C30@aaa.com",
            "from": "Double A <noreply@aaa.com>",
            "subject": "Welcome to Double A"
        },
        "attachments": [],
        "size": 12751
    },
    "recipient": "p31@gmail.com",
    "event": "accepted"
}
 */