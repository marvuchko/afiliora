const affiliateConfig = {
    type: 'pie',
    data: {
        labels: [
            'January',
            'February',
            'March',
            'April',
            'May',
            'June'
        ],
        datasets: [{
            data: [30, 78, 56, 34, 100, 45],
            backgroundColor: [
                '#FF6384',
                '#63FF84',
                '#84FF63',
                '#8463FF',
                '#6384FF',
                'red',
                'olive'
            ]
        }]
    },
    options: {
        maintainAspectRatio: false,
        responsive: true,
        title: {
            display: false,
            text: 'Affiliates Chart',
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
            position: 'left',
        },
    },
};

const affiliateCtx = document.getElementById('affiliate-pie-chart').getContext('2d');
window.affiliateChart = new Chart(affiliateCtx, affiliateConfig);