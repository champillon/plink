package models.mailgun.components

case class Flags(isRouted: Boolean
                 , isAuthenticated: Boolean
                 , isSystemTest: Boolean
                 , isTestMode: Boolean)