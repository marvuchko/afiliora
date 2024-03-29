(function() {
    const totalLeadsConfig = {
        type: 'bar',
        data: {
            labels: [
                'January',
                'February',
                'March',
                'April',
                'May',
                'June',
                'July',
            ],
            datasets: [{
                    label: new Date().getFullYear(),
                    backgroundColor: '#A9BCD0',
                    borderColor: '#A9BCD0',
                    data: [30, 78, 56, 34, 100, 45, 13],
                    fill: false,
                    barThickness: 8,
                },
                {
                    label: new Date().getFullYear() - 1,
                    fill: false,
                    backgroundColor: '#58A4B0',
                    borderColor: '#58A4B0',
                    data: [27, 68, 86, 74, 10, 4, 87],
                    barThickness: 8,
                },
            ],
        },
        options: {
            maintainAspectRatio: false,
            responsive: true,
            title: {
                display: false,
                text: 'Orders Chart',
            },
            tooltips: {
                mode: 'index',
                intersect: false,
            },
            hover: {
                mode: 'nearest',
                intersect: true,
            },
            legend: {
                labels: {
                    fontColor: 'black',
                },
                align: 'start',
                position: 'bottom',
            },
            scales: {
                xAxes: [{
                    display: false,
                    scaleLabel: {
                        display: true,
                        labelString: 'Month',
                    },
                    gridLines: {
                        borderDash: [2],
                        borderDashOffset: [2],
                        color: 'rgba(33, 37, 41, 0.3)',
                        zeroLineColor: 'rgba(33, 37, 41, 0.3)',
                        zeroLineBorderDash: [2],
                        zeroLineBorderDashOffset: [2],
                    },
                }, ],
                yAxes: [{
                    display: true,
                    scaleLabel: {
                        display: false,
                        labelString: 'Value',
                    },
                    gridLines: {
                        borderDash: [2],
                        drawBorder: false,
                        borderDashOffset: [2],
                        color: 'rgba(33, 37, 41, 0.2)',
                        zeroLineColor: 'rgba(33, 37, 41, 0.15)',
                        zeroLineBorderDash: [2],
                        zeroLineBorderDashOffset: [2],
                    },
                }, ],
            },
        },
    };

    const canvas = document.getElementById('total-leads-bar-chart');

    if (canvas) {
        const totalLeadsCtx = canvas.getContext('2d');
        window.totalLeadsChart = new Chart(totalLeadsCtx, totalLeadsConfig);
    }

})();