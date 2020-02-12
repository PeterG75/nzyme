import React from 'react';
import Reflux from 'reflux';
import moment from "moment";
import Routes from "../../util/Routes";

class BanditIdentifersTableRow extends Reflux.Component {

    render() {
        const identifier = this.props.identifier;

        return (
            <tr>
                <td>{identifier.type}</td>
                <td>{identifier.matches}</td>
                <td>
                    <span className="float-right">
                        <a className="btn btn-sm btn-secondary">Edit</a>&nbsp;
                        <a className="btn btn-sm btn-danger">Delete</a>
                    </span>
                </td>
            </tr>
        );
    }

}

export default BanditIdentifersTableRow;