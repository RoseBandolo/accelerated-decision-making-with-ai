/*
 * Copyright 2022 IBM Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import { Injectable } from '@angular/core';
import { MatDialog, MatDialogConfig } from '@angular/material/dialog';
import { map } from 'rxjs/operators';
import { Executor } from '../../../common';
import { AlgorithmDialogComponent } from '../../components/algorithm-dialog/algorithm-dialog.component';

@Injectable({
  providedIn: 'root',
})
export class AlgorithmDialogService {
  constructor(private dialog: MatDialog) {}

  openDialog(type: string, algorithm?: Executor) {
    const dialogConfig = new MatDialogConfig();

    dialogConfig.disableClose = false;
    dialogConfig.autoFocus = true;
    const dialogRef = this.dialog.open(AlgorithmDialogComponent, {
      width: '50%',
      data: { type, algorithm },
      disableClose: true,
    });
    return dialogRef.afterClosed().pipe(
      map((result) => {
        return result;
      })
    );
  }
}
