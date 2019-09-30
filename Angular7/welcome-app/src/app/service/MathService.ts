import { Observable } from 'rxjs'

/* import { Injectable } from '@angular/core'

@Injectable({
    providedIn:"root"
})
 */
export class MathService {

    checkPrime(num: number): boolean {
        if (num == 1) {
            return false
        }
        for (let i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false
            }
        }
        return true
    }
    // async checkPrimeAsync(num:number): Promise<boolean> {
    //     let resultPrime:boolean
    //     return new Promise((resolve,reject)=>{
    //         /* for (let i = 2; i <= num / 2; i++) {
    //             if (num % i == 0) {
    //                 resultPrime= false
    //             }
    //         } */
    //         resultPrime =true
    //         console.log(resultPrime)
    //         resolve(resultPrime)
    //     })

    // }
    checkPrimeAsync(num: number) {
        return Observable.create(observer => {
            observer.next(this.checkPrime(num))
            observer.complete()
        })
    }
}