@Amazon
Feature: Testing different actions on Amazon Prime

Scenario Outline: User able to login

Given the user navigate to https://www.primevideo.com
When user enters <username> and <password>
Then the user is able to login

  Examples:
          |username|password|
          |9074035006|#ranjini01|
Scenario Outline: User able to search a movie
Given the user navigate to https://www.primevideo.com and log in with <username> and <password>
When user enters <moviename> in the search box
Then movies are displayed
  Examples:
          |username|password|moviename|
          |9074035006|#ranjini01|Annabelle Comes Home|
          
Scenario Outline: User able to goto detail page
Given the user navigate to https://www.primevideo.com and log in with <username> and <password>
And user enters <moviename> in the search box
When user click on <moviename> 
Then it navigates to movie page
 Examples:
          |username|password|moviename|
          |9074035006|#ranjini01|Annabelle Comes Home|

Scenario Outline: User able to Play a movie
Given the user navigate to https://www.primevideo.com and log in with <username> and <password>
And user enters <moviename> in the search box,user click on <moviename>
When user clics on play button
Then Movie is playing
 Examples:
          |username|password|moviename|
          |9074035006|#ranjini01|Annabelle Comes Home|
          
          