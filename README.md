# React-Based-Calendar-Application

# Calendar Application

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
- [Deployment Details](#deployment-details)
- [Usage Instructions](#usage-instructions)
- [Endpoints for CRUD Operations](#endpoints-for-crud-operations)
- [Sample Data](#sample-data)
- [Testing and Validation](#testing-and-validation)
- [Known Limitations](#known-limitations)
- [Enhancements and Future Improvements](#enhancements-and-future-improvements)
- [Credentials for Login](#credentials-for-login)
- [Contact and Support](#contact-and-support)

## Overview
The Calendar Application is a modern, lightweight application built with React for managing schedules, tasks, and events. It features two main dashboards:
- **Admin Dashboard**: For managing schedules, tasks, and communication methods.
- **User Dashboard**: Displays tasks and events assigned to a user.

This project demonstrates clean code practices, efficient component design, and robust functionality while following React best practices.

---

## Features
- **Admin and User Dashboards**: Role-based routing for separate admin and user interfaces.
- **CRUD Operations**: Support for creating, reading, updating, and deleting tasks/schedules.
- **Color-Coded Statuses**: Visual indicators for task statuses (overdue, due, completed).
- **Routing**: Navigation using `react-router-dom`.
- **Tooltips**: Additional task/event details.
- **Responsive Design**: Optimized for mobile and desktop devices.
- **Mock Data**: Included for testing and validation purposes.

---

## Project Structure
calendar-app/
├── src/
│   ├── components/
│   │   ├── Admin/
│   │   │   └── AdminDashboard.js
│   │   └── User/
│   │       └── UserDashboard.js
│   ├── App.js
│   ├── index.js
│   └── index.css
├── public/
│   └── index.html
└── package.json


### Key Files:
- **App.js**: Entry point for routing and layout.
- **AdminDashboard.js & UserDashboard.js**: Core dashboard components.
- **index.js**: Application initialization.
- **index.css**: Styling for the application.

---

## Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/Pradip1807/React-Based-Calendar-Application.git
cd React-Based-Calendar-Application
```


### 2. Install Dependencies
```bash
npm install
```

### 3. Start the Development Server
```bash
npm start
```
Access the application at http://localhost:3000.

### 4. Build for Production
```bash
npm run build
```
The optimized build will be located in the /build directory.

# Deployment Details
## Live Application URL
The application is deployed and accessible at: Live App on Vercel

## Steps to Deploy:
## On Vercel/Netlify:
- Connect your GitHub repository.
- Deploy the project directly from the repository.
# Static Hosting (e.g., GitHub Pages):
- Run npm run build.
- Upload the /build folder to a static hosting platform.
- Usage Instructions
Admin Dashboard
URL: http://localhost:3000/admin
## Features:
- Add, edit, and delete tasks/events.
- View color-coded task statuses.
- User Dashboard
URL: http://localhost:3000/user
## Features:
- View assigned tasks and events.
- Access tooltips for additional details.
- Endpoints for CRUD Operations
# Tasks Endpoints:

## Get All Tasks

- Method: GET
- Endpoint: /api/tasks
- Response:
- json
```bash 
[
    { "id": 1, "title": "Submit Proposal", "status": "Due" },
    { "id": 2, "title": "Follow-up Meeting", "status": "Overdue" }
]
```
## Create a Task

- Method: POST
- Endpoint: /api/tasks
- Payload:
- json
```bash 
{ "title": "New Task", "dueDate": "2025-01-05", "status": "Due" }
```
## Update a Task

- Method: PUT
- Endpoint: /api/tasks/:id
- Payload:
- json
```bash
{ "title": "Updated Task", "status": "Completed" }
```
# Delete a Task

- Method: DELETE
- Endpoint: /api/tasks/:id
```bash
ID	Title	Due Date	Status
1	Submit Proposal	2025-01-05	Due
2	Follow-up Meeting	2024-12-30	Overdue
3	Code Review	2024-12-28	Completed
```
1. Testing and Validation
- Local Testing: Open http://localhost:3000 after starting the server.
- Navigate to /admin and /user for testing.
2. Browser Testing:
- Verify responsiveness on mobile and desktop.
3. Unit Testing:
- Use Jest and React Testing Library for component testing.
4. End-to-End Testing:
- Use tools like Cypress or Playwright.
- Known Limitations
- Uses mock data instead of a live backend.
- Role-based authentication simulated but not implemented securely.
- Enhancements and Future Improvements
- Backend Integration: Add RESTful API and JWT-based authentication.
5. Database: Replace mock data with MySQL or MongoDB.
6. UI Improvements: Use Material-UI or Tailwind CSS.
7. Calendar Component: Integrate libraries like FullCalendar.js.
## Credentials for Login
```bash
Role	Username	Password
Admin	admin@demo.com	admin123
User	user@demo.com	user123
```
## Contact and Support
For any issues or queries, please contact:
Email: kumarpradip1807@gmail.com

### Steps to Upload `README.md`:
1. Add the file to the root of your project.
2. Commit and push to GitHub:
   ```bash
   git add README.md
   git commit -m "Add README file"
   git push origin main
   ```
Verify it on your GitHub repository page.
Let me know if you need further assistance!


