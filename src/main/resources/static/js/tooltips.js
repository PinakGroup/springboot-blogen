//////
// Functions used by Bootstrap to display tooltips
//////

//need to initialize tooltips in order for them to show up
$('[data-toggle="tooltip"]').tooltip();

//create a function that shows a tooltip
function showTooltip () {
    $('#help').tooltip('show');
}

//create a function to hide a tooltip
function hideTooltip () {
    $('#help').tooltip('hide');
}

//create a function to toggle a tooltip
function toggleTooltip () {
    $('#help').tooltip('toggle');
}