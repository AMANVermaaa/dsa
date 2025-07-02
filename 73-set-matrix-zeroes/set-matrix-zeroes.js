/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var setZeroes = function(matrix) {
    let m = matrix.length, n = matrix[0].length;
    let firstRow0 = false, firstCol0 = false;

    for (let i = 0; i < m; i++) if (matrix[i][0] === 0) firstCol0 = true;
    for (let j = 0; j < n; j++) if (matrix[0][j] === 0) firstRow0 = true;

    for (let i = 1; i < m; i++)
        for (let j = 1; j < n; j++)
            if (matrix[i][j] === 0) {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }

    for (let i = 1; i < m; i++)
        for (let j = 1; j < n; j++)
            if (matrix[i][0] === 0 || matrix[0][j] === 0)
                matrix[i][j] = 0;

    if (firstRow0) for (let j = 0; j < n; j++) matrix[0][j] = 0;
    if (firstCol0) for (let i = 0; i < m; i++) matrix[i][0] = 0;
};