import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'mypipe'
})
export class MypipePipe implements PipeTransform {

  transform(value: String, gender: String): String {
    if (gender == "male")
      return "Mr. " + value
    return "Mrs. " + value
  }

}
