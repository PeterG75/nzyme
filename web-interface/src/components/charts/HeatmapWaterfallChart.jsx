import React from 'react';

import Plot from 'react-plotly.js';

class HeatmapWaterfallChart extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            data: props.data
        };
    }

    render() {
        const data = this.state.data;

        const finalData = [
            {
                z: data.z,
                type: "heatmap",
                hoverinfo: "none",
                colorscale: [[0, 'rgb(12,13,22)'], [1, 'rgb(14,201,0)']]
            }
        ];

        return (
            <Plot
                data={finalData}
                layout={{
                    width: 1100,
                    height: 400,
                    font: { family: "'Inconsolata', monospace", size: 10 },
                    margin: { l: 60, r: 60, b: 50, t: 25, pad: 0 },
                    title: { text: "ONE PING ONLY" },
                    paper_bgcolor: "#0c0d16",
                    plot_bgcolor: "#0c0d16",
                    showlegend: false,
                    dragmode: false,
                    clickmode: "none",
                    xaxis: { visible: true },
                    yaxis: { visible: false }
                }}
                config={{
                    displayModeBar: false
                }}
            />
        );
    }

}

export default HeatmapWaterfallChart;