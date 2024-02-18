package br.com.spotmusicbackend.SpotMusic

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpotMusicApplication

fun main(args: Array<String>) {
	runApplication<SpotMusicApplication>(*args)
}
