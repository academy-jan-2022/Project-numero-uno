package com.codurance.action.ship;

import com.codurance.model.crosscutting.EntityId;
import com.codurance.model.harbour.Dock;
import com.codurance.model.harbour.HarbourService;
import com.codurance.model.ship.AnchorService;
import com.codurance.model.ship.NavigationService;

import java.util.List;

public class DockInHarbour {

    private final HarbourService harbourService;
    private final NavigationService navigationService;
    private final AnchorService anchorService;

    public DockInHarbour(HarbourService harbourService, NavigationService navigationService, AnchorService anchorService) {
        this.harbourService = harbourService;
        this.navigationService = navigationService;
        this.anchorService = anchorService;
    }

    public void execute(EntityId harbourId) throws Exception {
        List<Dock> availableDocks = harbourService.getAvailableDocks(harbourId);

        if (availableDocks.size() < 1)
            throw new Exception();

        Dock targetDock = availableDocks.get(0);

        navigationService.to(targetDock.coordinates);
        anchorService.drop();
        targetDock.isAvailable = false;
        harbourService.updateDock(targetDock);

    }
}
