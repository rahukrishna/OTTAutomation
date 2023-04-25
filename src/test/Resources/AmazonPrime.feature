@Amazon
Feature: Testing different actions on Amazon Prime

Scenario Outline: User able to login

Given the user navigate to https://www.primevideo.com
When user enters <username> and <password>
Then the user is able to login

  Examples:
          |username|password|
          |9074035006|#ranjini01|