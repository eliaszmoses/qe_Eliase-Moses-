@LinkedIn
Feature: LinkedIn Home

  @Login @NormalNegative @LoginLinkedInFailed
  Scenario: User cannot login with incorrect username and incorrect password
    Given user is on linkedin landing page
    And user input incorrect username "USERNAME"
    And user input incorrect password "PASSWORD"
    And user click login
    Then user cannot login and still on login page

  @CreatePost @NormalPositive
  Scenario: Create New Post
    Given user is on linkedin landing page
    And user input correct username
    And user input correct password
    And user click login
    Then user is on home page
    And user input post
    And user click send post
    Then user see their post in their feed

  @CommentPost @NormalPositive
  Scenario: Comment on our own post
    Given user is landing page
    And user input correct username
    And user input correct password
    And user click login
    Then user is on home page
    And user input post
    And user click send post
    Then user see their post in their feed
    And user click comment button
    And user input comment
    And user click send comment
    Then user see their comment on their post

  @Repost @NormalPositive
  Scenario: Repost our own post
    Given user is landing page
    And user input correct username
    And user input correct password
    And user click login
    Then user is on home page
    And user input post
    And user click send post
    Then user see their post in their feed
    And user click repost
    Then user see their reposted post in their feed

  @CreatePostWithPhoto @NormalPositive
  Scenario: Create New Post with Photo
    Given user is landing page
    And user input correct username
    And user input correct password
    And user click login
    Then user is on home page
    And user input post with photo
    And user click send post
    Then user see their post in their feed

  @CreatePostWithVideo @NormalPositive
  Scenario: Create New Post with Video
    Given user is landing page
    And user input correct username
    And user input correct password
    And user click login
    Then user is on home page
    And user input post with video
    And user click send post
    Then user see their post in their feed

  @CreatePostWithEvent @NormalPositive
  Scenario: Create New Post with Event
    Given user is landing page
    And user input correct username
    And user input correct password
    And user click login
    Then user is on home page
    And user input post with event
    And user click send post
    Then user see their post in their feed

  @LikePost @NormalPositive
  Scenario: Like our own post
    Given user is landing page
    And user input correct username
    And user input correct password
    And user click login
    Then user is on home page
    And user input post
    And user click send post
    Then user see their post in their feed
    And user click like button
    And user choose like emoticon
    Then user see their post is liked