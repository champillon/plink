# PLINK (Perfect LINKage)
A email scheduler which scheduling based on frequently email-checking time of end-recipient.

# Prerequisite
1. JVM 1.8+
2. SBT
3. Postgresql 9.x+

# Test
$> sbt clean compile test

# Deploy
1. $> sbt dist
2. unzip built file
3. $> cd [built file]\bin\.[built name]
