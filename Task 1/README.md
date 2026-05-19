# Project Title: SmartWap – Social Media Application

----------

# Preface

This document provides the Software Requirements Specification (SRS) for the **SmartWap – Social Media Application**. It defines the system functionalities, security requirements, performance standards, and architectural design necessary for development and deployment.

----------

# Version History

-   **Version 1.0 - Initial Draft


-   **Version 1.1- Added Non-Functional Requirements

-   **Version 1.2 - Added System Models and Future Enhancements


----------

# 1. Introduction

## Purpose

The **SmartWap** is a web-based social media platform designed to help users connect, communicate, share content, and interact in real time. The system enables users to create profiles, upload posts, chat with friends, react to content, and build online communities.

----------

## Document Conventions

This document follows the IEEE SRS standard using:

-   **Must** – Mandatory requirement
-   **Should** – Recommended feature
-   **May** – Optional enhancement

----------

## Intended Audience and Reading Suggestions

-   **Developers & Designers** – For implementation guidance
-   **Project Managers** – For project planning
-   **Testers & QA Teams** – For requirement validation
-   **Stakeholders** – For understanding system capabilities

----------

## Scope

The system provides:

-   User registration and authentication
-   Profile management
-   Post creation and sharing
-   Real-time messaging system
-   Friend request and follow system
-   Notifications and reactions
-   Media upload and sharing

----------

## References

-   IEEE Standard 830-1998 (Software Requirements Specification)
-   Social Media Platform Requirement Analysis
-   System Modeling Documentation

----------

# 2. Overall Description

## Product Perspective

The **SmartWap** system is a standalone web application that may integrate with:

-   Google Authentication
-   Facebook Login
-   Cloud Storage Services
-   Email Notification Services

----------

## Product Functions

### User Management

-   User registration and login
-   Password recovery
-   Profile editing

### Social Features

-   Add friends and follow users
-   Create posts and stories
-   Like, comment, and share posts

### Messaging System

-   Real-time private messaging
-   Group chat support

### Media Sharing

-   Upload images and videos
-   Share multimedia content

### Notifications

-   Real-time alerts for messages, likes, comments, and friend requests

----------

## User Classes and Characteristics

### Admin

-   Manages users, reports, and platform settings

### Registered User

-   Creates posts, chats, reacts, and manages profile

### Guest User

-   Limited browsing access without login

----------

## Operating Environment

-   Web-based Application
-   Supported Browsers:
    -   Google Chrome
    -   Mozilla Firefox
    -   Microsoft Edge

### Database

-   MongoDB

### Hosting

-   Cloud-based infrastructure

----------

## Design and Implementation Constraints

-   Must ensure user data privacy and security
-   Must support scalable architecture
-   Internet connection required for real-time communication

----------

## Assumptions and Dependencies

-   Users have internet access
-   Cloud services remain available
-   Future mobile application support may be added

----------

# 3. System Requirements Specification

# Functional Requirements

----------

## User Authentication

-   The system must allow users to register and log in.
-   The system must support email verification.
-   The system must provide password reset functionality.
-   The system must implement secure authentication.

----------

## Profile Management

-   Users must be able to create and edit profiles.
-   Users should upload profile pictures and cover photos.
-   Users may update personal information.

----------

## Post Management

-   Users must create text, image, and video posts.
-   Users should edit and delete their posts.
-   The system must display posts in a news feed.

----------

## Friend & Follow System

-   Users must send and accept friend requests.
-   Users may follow public profiles.
-   Users should block unwanted users.

----------

## Messaging System

-   Users must send and receive messages in real time.
-   The system should support group messaging.
-   Users may share files and media in chats.

----------

## Reactions and Comments

-   Users must like and comment on posts.
-   Users may share posts with others.
-   Users should react using emojis.

----------

## Notification System

-   The system must notify users about:
    -   Friend requests
    -   Likes and comments
    -   New messages
    -   Shares and mentions

----------

## Search System

-   Users should search for:
    -   Friends
    -   Posts
    -   Groups
    -   Pages

----------

# Non-Functional Requirements

----------

## Performance Requirements

-   The system must support 2000+ concurrent users.
-   Real-time messaging latency should be under 2 seconds.
-   Feed loading time should be under 3 seconds.

----------

## Security Requirements

-   Passwords must be encrypted.
-   HTTPS protocol must be implemented.
-   The system must provide role-based access control.
-   User data must be securely stored.

----------

## Usability Requirements

-   The system should provide responsive UI/UX.
-   The interface should be mobile-friendly.
-   Accessibility standards should be maintained.

----------

## Reliability and Availability

-   The system must ensure 99.9% uptime.
-   Automatic backup mechanisms must be available.

----------

## Maintainability

-   The application should support modular updates.
-   Logging and debugging systems must be implemented.

----------

## Portability

-   The system should run on Windows, Linux, and MacOS.
-   Cloud deployment support is required.

----------

# 4. System Models

## CONTEXT DIAGRAM

### External Entities:

-   User
-   Admin
-   Database
-   Notification Service
-   Cloud Storage

----------

## ACTIVITY DIAGRAM

### User Activity Flow:

1.  Register/Login
2.  Create Profile
3.  Add Friends
4.  Create Posts
5.  Interact with Content
6.  Send Messages
7.  Receive Notifications

----------

## USE CASE DIAGRAMS

### Admin Use Cases

-   Manage Users
-   Remove Inappropriate Content
-   Monitor Reports
-   Manage System Settings

### User Use Cases

-   Register/Login
-   Edit Profile
-   Upload Posts
-   Send Messages
-   React to Posts
-   Add Friends

----------

## SEQUENCE DIAGRAM

### Messaging Process:

1.  User sends message
2.  System validates message
3.  Database stores message
4.  Receiver gets real-time notification

----------

## ENTITY RELATIONSHIP DIAGRAM (ERD)

### Entities:

-   User
-   Post
-   Comment
-   Reaction
-   Message
-   FriendRequest
-   Notification

### Relationships:

-   One User → Many Posts
-   One Post → Many Comments
-   One User → Many Messages
-   One User → Many Friend Requests

----------

## STATE DIAGRAM

### Post States:

-   Created
-   Published
-   Edited
-   Shared
-   Deleted

----------

# 5. System Evolution

## Assumptions

-   AI-powered content recommendations may be added.
-   Mobile applications may be developed in future.
-   Voice and video calling features may be integrated.

----------

## Expected Changes

-   AI-based friend suggestions
-   Live streaming support
-   Advanced analytics dashboard
-   Third-party API integrations

----------

# 6. Appendices

## Hardware Requirements

-   Cloud-based hosting server
-   Minimum 16GB RAM
-   SSD Storage

----------

## Database Requirements

-   Secure NoSQL database structure
-   High-speed data retrieval
-   Backup and recovery support

----------

# Glossary

Term

Meaning

UI/UX

User Interface / User Experience

API

Application Programming Interface

HTTPS

HyperText Transfer Protocol Secure

DBMS

Database Management System

Admin

System Administrator
                    
