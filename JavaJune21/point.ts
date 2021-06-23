export class Point {
    constructor(private _x?: number, private _y?: number) {

    }

    drawPoint() {
        console.log('X: ' + this._x + ', Y: ' + this._y);
    }

    getY() {
        return this._y;
    }
    setY(y: number) {
        this._y = y;
    }

    get x() {
        return this._x;
    }
    set x(x: number) {
        if(x < 0) {
            throw new Error("x cannot be less than 0!");
        }
        else {
            this._x = x;
        }
    }
}