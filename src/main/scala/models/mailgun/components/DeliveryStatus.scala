package models.mailgun.components

case class DeliveryStatus(tls: Boolean
                          , mxHost: String
                          , code: Int
                          , description: String
                          , sessionSeconds: Double
                          , utf8: String
                          , attemptNo: Int
                          , message: String
                          , certificateVerified: Boolean)

/*
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
    }
 */