import React from "react";
import ReactDOM from "react-dom";
import App from "./app/component/App";
//import "./index.css";
import "github-fork-ribbon-css/gh-fork-ribbon.css";
import TaskInfo from "./app/component/Task/TaskInfo";
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';

ReactDOM.render((
        <Router>
            <div>


                {/*<Route path="/tasks" component={TaskInfo}/>*/}
                <Route path="/tasks/:id" component={TaskInfo}/>
                <Route path="/App" component={App}/>

            </div>
        </Router>),
    document.getElementById("root")
);