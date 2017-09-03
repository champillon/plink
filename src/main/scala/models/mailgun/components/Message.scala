package models.mailgun.components

case class Message(headers: Map[String, String]
                   , attachments: List[String]
                   , size: Long)

/*
"message": {
        "headers": {
            "message-id": "20170702161804.122842.0A69345BBA377758@aaa.com"
        }
    }
 */

/*
"message": {
        "headers": {
            "to": "นางสาวภัช ภัค <p31@gmail.com>",
            "message-id": "20170903005951.49262.365EDCC263C33C30@billme.co.th",
            "from": "Double A <noreply@aaa.com>",
            "subject": "Welcome to Double A"
        },
        "attachments": [],
        "size": 12751
    }
 */