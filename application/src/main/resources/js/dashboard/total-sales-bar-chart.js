const totalSalesConfig = {
    type: 'line',
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
                data: [65, 78, 66, 44, 56, 67, 75],
                fill: false,
            },
            {
                label: new Date().getFullYear() - 1,
                fill: false,
                backgroundColor: '#58A4B0',
                borderColor: '#58A4B0',
                data: [40, 68, 86, 74, 56, 60, 87],
            },
        ],
    },
    options: {
        maintainAspectRatio: false,
        responsive: true,
        title: {
            display: false,
            text: 'Sales Charts',
            fontColor: 'white',
        },
        legend: {
            labels: {
                fontColor: 'black',
            },
            align: 'end',
            position: 'bottom',
        },
        tooltips: {
            mode: 'index',
            intersect: false,
        },
        hover: {
            mode: 'nearest',
            intersect: true,
        },
        scales: {
            xAxes: [{
                ticks: {
                    fontColor: 'rgba(0,0,0,.7)',
                },
                display: true,
                scaleLabel: {
                    display: false,
                    labelString: 'Month',
                    fontColor: 'black',
                },
                gridLines: {
                    display: false,
                    borderDash: [2],
                    borderDashOffset: [2],
                    color: 'rgba(33, 37, 41, 0.3)',
                    zeroLineColor: 'rgba(0, 0, 0, 0)',
                    zeroLineBorderDash: [2],
                    zeroLineBorderDashOffset: [2],
                },
            }, ],
            yAxes: [{
                ticks: {
                    fontColor: 'rgba(0, 0, 0,.7)',
                },
                display: true,
                scaleLabel: {
                    display: false,
                    labelString: 'Value',
                    fontColor: 'black',
                },
                gridLines: {
                    borderDash: [3],
                    borderDashOffset: [3],
                    drawBorder: false,
                    color: 'rgba(0, 0, 0, 0.15)',
                    zeroLineColor: 'rgba(33, 37, 41, 0)',
                    zeroLineBorderDash: [2],
                    zeroLineBorderDashOffset: [2],
                },
            }, ],
        },
    },
};

const totalSalesCtx = document.getElementById('total-sales-bar-chart').getContext('2d');
window.totalSalesChart = new Chart(totalSalesCtx, totalSalesConfig);