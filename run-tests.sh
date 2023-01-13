#!/bin/bash

echo "running tests..."

echo "STARTING DATABASE"
docker compose up database --detach

echo "cleaning project"
./mvnw clean

echo "testing"
./mvnw test

docker compose stop