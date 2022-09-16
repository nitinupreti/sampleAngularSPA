import { Component, OnInit,Input } from '@angular/core';
import {MapTo} from '@adobe/aem-angular-editable-components';

const CardPanelComponentEditConfig = {
  emptyLabel: 'Card Panel Component',
  isEmpty: cqModel =>
    !cqModel || !cqModel.title || cqModel.title.trim().length < 1 || !cqModel.subtitle || cqModel.subtitle.trim().length < 1 || !cqModel.fileReference || !cqModel.description || cqModel.description.trim().length < 1
};

@Component({
  selector: 'app-card-panel',
  templateUrl: './card-panel.component.html',
  styleUrls: ['./card-panel.component.scss','./tachyons.css']
})
export class CardPanelComponent implements OnInit {
  @Input() title: string;
  @Input() subtitle: string;
  @Input() description: string;
  @Input()fileReference: string;

  constructor() { }

  ngOnInit(): void {
    
  }

}

MapTo('sampleangularspa/components/card-panel')(CardPanelComponent,CardPanelComponentEditConfig);