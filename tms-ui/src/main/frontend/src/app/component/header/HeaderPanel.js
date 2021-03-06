import React from "react";
import "./HeaderPanel.css";

class HeaderPanel extends React.Component {
  render() {
    return (
      <div>
        <header className = "masthead">
          <div className = "overlay"></div>
          <div className="container">
            <div className="row">
              <div className="col-lg-8 col-md-10 mx-auto">
                <div className="site-heading">
                  <h1>Hi everybody</h1>
                  <span className="subheading">There will be Issue Tracker application soon...</span>
                </div>
              </div>
            </div>
          </div>
        </header>
      </div>
    );
  }
}

export default HeaderPanel;