import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardPanelComponent } from './card-panel.component';

describe('TestComponent', () => {
  let component: CardPanelComponent;
  let fixture: ComponentFixture<CardPanelComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CardPanelComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CardPanelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
