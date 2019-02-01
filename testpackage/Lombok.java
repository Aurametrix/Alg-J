plugins {
    id 'io.franzbecker.gradle-lombok' version '1.14'
    id 'java'
}
repositories {
    jcenter() // or Maven central, required for Lombok dependency
}
lombok {
	version = '1.18.4'
	sha256 = ""
}
