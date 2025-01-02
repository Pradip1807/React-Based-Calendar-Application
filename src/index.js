// src/index.js
import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';

ReactDOM.render(
  <React.StrictMode>
    <App />// src/index.js
           import React from 'react';
           import ReactDOM from 'react-dom/client';
           import './index.css';  // Import CSS styles
           import App from './App';  // Import App component
           import reportWebVitals from './reportWebVitals';

           const root = ReactDOM.createRoot(document.getElementById('root'));
           root.render(
             <React.StrictMode>
               <App />
             </React.StrictMode>
           );

           reportWebVitals();

  </React.StrictMode>,
  document.getElementById('root')
);
