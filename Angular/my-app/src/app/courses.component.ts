import { Component } from "@angular/core";

@Component({
    selector: 'app-courses',
    template: `
        <h2>{{ title }}</h2>
        <ul>
            <li *ngFor="let course of courses">{{ course }}</li>
        </ul>
    `
})
export class CoursesComponent {
    title = "List of Courses";

    courses = ['course1', 'course2', 'course3'];

    getTitle() {
        return this.title;
    }
}