.PHONY: help build test lint fmt

help:
	@cat Makefile

build:
	./gradlew build

test:
	./gradlew test

lint:
	./gradlew lintKotlin

fmt:
	./gradlew formatKotlin

clean:
	./gradlew clean
