import { Component, OnInit } from "@angular/core";
import { TokenStorageService } from 'src/app/_services/token-storage.service';

@Component({
  selector: "app-admin-layout",
  templateUrl: "./admin-layout.component.html",
  styleUrls: ["./admin-layout.component.scss"]
})
export class AdminLayoutComponent implements OnInit {
  isLoggedIn = false;
  public sidebarColor: string = "red";

  constructor(private tokenStorageService: TokenStorageService) {}
  
  ngOnInit() {
      this.isLoggedIn = !!this.tokenStorageService.getToken();
  }
}
