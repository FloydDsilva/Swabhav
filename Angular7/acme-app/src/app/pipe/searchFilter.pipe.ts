import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'searchFilter'
})
export class SearchFilterPipe implements PipeTransform {

  transform(values: any[], searchText: String): any {
    if(!searchText)
      return values
    return values.filter(value=>value.productName.toLowerCase().indexOf(searchText.toLowerCase())!==-1);
  }

}
